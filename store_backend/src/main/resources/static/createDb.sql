CREATE DATABASE storeGohan;

USE storeGohan;

drop database  storeGohan;
CREATE TABLE category (
                          category_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
                          category_name VARCHAR(255)
);

CREATE TABLE brand (
                       brand_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
                       brand_name VARCHAR(255)
);

CREATE TABLE size (
                      size_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
                      size_number INT
);

CREATE TABLE products (
                          product_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
                          product_name VARCHAR(255),
                          product_price FLOAT,
                          product_description LONGTEXT,
                          product_imgCode INT,
                          product_brandId INT,
                          product_categoryId INT,
                          product_createdAt TIMESTAMP,
                          FOREIGN KEY (product_categoryId) REFERENCES category(category_id),
                          FOREIGN KEY (product_brandId) REFERENCES brand(brand_id)
);

CREATE TABLE productImages (
                               productImage_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
                               productImage_productId INT,
                               productImage_url VARCHAR(255),
                               FOREIGN KEY (productImage_productId) REFERENCES products(product_id)
);

CREATE TABLE productQuantity (
                                 productQuantity_productId INT,
                                 productQuantity_sizeId INT,
                                 productQuantity_quantity INT,
                                 FOREIGN KEY (productQuantity_productId) REFERENCES products(product_id),
                                 FOREIGN KEY (productQuantity_sizeId) REFERENCES size(size_id)
);

CREATE TABLE appUser (
                         appUser_userId INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
                         appUser_userName VARCHAR(36),
                         appUser_encrytedPassword VARCHAR(128),
                         appUser_enabled BIT
);

CREATE TABLE appRole (
                         appRole_roleId INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
                         appRole_roleName VARCHAR(30)
);

CREATE TABLE userRole (
                          userRole_roleId INT,
                          userRole_userId INT,
                          userRole_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
                          FOREIGN KEY (userRole_roleId) REFERENCES appRole(appRole_roleId),
                          FOREIGN KEY (userRole_userId) REFERENCES appUser(appUser_userId)
);

CREATE TABLE verificationToken (
                                   verificationToken_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
                                   verificationToken_expiryTime DATETIME(6),
                                   verificationToken_token VARCHAR(255),
                                   verificationToken_userId INT,
                                   FOREIGN KEY (verificationToken_userId) REFERENCES appUser(appUser_userId)
);

CREATE TABLE customer (
                          customer_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
                          customer_name VARCHAR(50),
                          customer_email VARCHAR(100),
                          customer_phone VARCHAR(15),
                          customer_gender ENUM('Male', 'Female', 'Other'),
                          customer_userId INT,
                          FOREIGN KEY (customer_userId) REFERENCES appUser(appUser_userId)
);

CREATE TABLE orders (
                        orders_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
                        orders_customerId INT,
                        orders_nameRecipent VARCHAR(50),
                        orders_phoneRecipent VARCHAR(15),
                        orders_addressRecipent VARCHAR(255),
                        orders_date DATETIME(6),
                        orders_status ENUM('INPROGRESS', 'DELIVERED'),
                        orders_note VARCHAR(255),
                        orders_totalPrice FLOAT,
                        FOREIGN KEY (orders_customerId) REFERENCES customer(customer_id)
);

CREATE TABLE orderItems (
                            orderItems_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
                            orderItems_quantity INT,
                            orderItems_productId INT,
                            orderItems_sizeId INT,
                            FOREIGN KEY (orderItems_productId) REFERENCES products(product_id),
                            FOREIGN KEY (orderItems_sizeId) REFERENCES size(size_id)
);

CREATE TABLE cart (
                      cart_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
                      cart_customerId INT,
                      FOREIGN KEY (cart_customerId) REFERENCES customer(customer_id)
);

CREATE TABLE cartDetail (
                            cartDetail_cartId INT,
                            cartDetail_productId INT,
                            cartDetail_sizeId INT,
                            cartDetail_quantity INT,
                            FOREIGN KEY (cartDetail_cartId) REFERENCES cart(cart_id),
                            FOREIGN KEY (cartDetail_productId) REFERENCES products(product_id),
                            FOREIGN KEY (cartDetail_sizeId) REFERENCES size(size_id)
);

alter table cartdetail
    add constraint cartdetail_pk
        primary key (cartDetail_cartId, cartDetail_productId, cartDetail_sizeId);

alter table productquantity
    add constraint productquantity_pk
        primary key (productQuantity_productId, productQuantity_sizeId);


