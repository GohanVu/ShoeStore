
INSERT INTO category (category_name) VALUES
                                         ('Sneakers'),
                                         ('Boots'),
                                         ('Sandals'),
                                         ('Loafers'),
                                         ('Heels'),
                                         ('Flip Flops'),
                                         ('Running Shoes'),
                                         ('Formal Shoes'),
                                         ('Casual Shoes'),
                                         ('Sports Shoes');

INSERT INTO brand (brand_name) VALUES
                                   ('Nike'),
                                   ('Adidas'),
                                   ('Puma'),
                                   ('Reebok'),
                                   ('New Balance'),
                                   ('Vans'),
                                   ('Converse'),
                                   ('Timberland'),
                                   ('Dr. Martens'),
                                   ('Skechers');

INSERT INTO size (size_number) VALUES
                                   (38),
                                   (39),
                                   (40),
                                   (41),
                                   (42),
                                   (43),
                                   (44),
                                   (45),
                                   (46),
                                   (47);

INSERT INTO products (product_name, product_price, product_description, product_img_code, product_brand_id, product_category_id, product_created_at) VALUES
                                                                                                                                                     ('Nike Air Force 1', 120.00, 'Classic Nike sneakers with premium leather.', 101, 1, 1, '2024-10-01 10:00:00'),
                                                                                                                                                     ('Adidas Ultraboost', 180.00, 'Comfortable running shoes with Boost technology.', 102, 2, 7, '2024-10-02 11:00:00'),
                                                                                                                                                     ('Puma Suede Classic', 65.00, 'Timeless Puma sneakers with suede upper.', 103, 3, 1, '2024-10-03 12:00:00'),
                                                                                                                                                     ('Reebok Club C', 75.00, 'Stylish Reebok sneakers for everyday wear.', 104, 4, 1, '2024-10-04 13:00:00'),
                                                                                                                                                     ('New Balance 574', 80.00, 'Retro New Balance sneakers with excellent cushioning.', 105, 5, 1, '2024-10-05 14:00:00'),
                                                                                                                                                     ('Vans Old Skool', 60.00, 'Vans classic skate shoes with durable construction.', 106, 6, 1, '2024-10-06 15:00:00'),
                                                                                                                                                     ('Converse Chuck Taylor', 55.00, 'Iconic Converse high-tops for a casual look.', 107, 7, 1, '2024-10-07 16:00:00'),
                                                                                                                                                     ('Timberland 6-Inch Boots', 150.00, 'Durable Timberland boots for all terrains.', 108, 8, 2, '2024-10-08 17:00:00'),
                                                                                                                                                     ('Dr. Martens 1460', 130.00, 'Classic Dr. Martens boots with air-cushioned soles.', 109, 9, 2, '2024-10-08 18:00:00'),
                                                                                                                                                     ('Skechers D\'Lites', 70.00, 'Comfortable Skechers sneakers with a retro design.', 110, 10, 1, '2024-10-08 19:00:00');

INSERT INTO appUser (app_user_user_name, app_user_encryted_password, app_user_enabled) VALUES
('admin', '123', 1),
('emp', '123', 1),
('lethithu', 'hashedpassword3', 1),
('phamdinh', 'hashedpassword4', 1),
('hoangmai', 'hashedpassword5', 1),
('dangminh', 'hashedpassword6', 1),
('phamthuy', 'hashedpassword7', 1),
('vohuy', 'hashedpassword8', 1),
('luutri', 'hashedpassword9', 1),
('bachngoc', 'hashedpassword10', 1);

INSERT INTO appRole (app_role_role_name) VALUES
('ADMIN'),
('USER');

INSERT INTO userRole (user_role_role_id, user_role_user_id) VALUES
(1, 1),
(2, 2),
(2, 3),
(2, 4),
(2, 5),
(2, 6),
(2, 7),
(2, 8),
(2, 9),
(2, 10);

INSERT INTO verificationToken (verification_token_expiry_time, verification_token_token, verification_token_user_id) VALUES
('2024-10-09 10:00:00', 'token123abc', 1),
('2024-10-09 11:00:00', 'token456def', 2),
('2024-10-09 12:00:00', 'token789ghi', 3),
('2024-10-09 13:00:00', 'token012jkl', 4),
('2024-10-09 14:00:00', 'token345mno', 5),
('2024-10-09 15:00:00', 'token678pqr', 6),
('2024-10-09 16:00:00', 'token901stu', 7),
('2024-10-09 17:00:00', 'token234vwx', 8),
('2024-10-09 18:00:00', 'token567yz0', 9),
('2024-10-09 19:00:00', 'token890abc', 10);

INSERT INTO customer (customer_name, customer_email, customer_phone, customer_gender, customer_user_id) VALUES
('Admin', 'admin@example.com', '0901234567', 'Male', 1),
('Employee', 'employee@example.com', '0902345678', 'Male', 2),
('Lê Thị C', 'lethithu@example.com', '0903456789', 'Female', 3),
('Phạm Đình D', 'phamdinh@example.com', '0904567890', 'Male', 4),
('Hoàng Mai E', 'hoangmai@example.com', '0905678901', 'Female', 5),
('Đặng Minh F', 'dangminh@example.com', '0906789012', 'Male', 6),
('Phạm Thúy G', 'phamthuy@example.com', '0907890123', 'Female', 7),
('Võ Huy H', 'vohuy@example.com', '0908901234', 'Male', 8),
('Lưu Trí I', 'luutri@example.com', '0909012345', 'Male', 9),
('Bạch Ngọc J', 'bachngoc@example.com', '0900123456', 'Female', 10);

INSERT INTO orders (orders_customer_id, orders_name_recipent, orders_phone_recipent, orders_address_recipent, orders_date, orders_status, orders_note, orders_total_price) VALUES
(1, 'Nguyễn Văn A', '0901234567', '123 Đường A, Quận 1, TP.HCM', '2024-10-01 10:00:00', 'INPROGRESS', 'Giao hàng vào buổi chiều', 120.00),
(2, 'Trần Anh B', '0902345678', '456 Đường B, Quận 2, TP.HCM', '2024-10-02 11:00:00', 'DELIVERED', 'Không có ghi chú', 180.00),
(3, 'Lê Thị C', '0903456789', '789 Đường C, Quận 3, TP.HCM', '2024-10-03 12:00:00', 'INPROGRESS', 'Giao nhanh', 65.00),
(4, 'Phạm Đình D', '0904567890', '321 Đường D, Quận 4, TP.HCM', '2024-10-04 13:00:00', 'DELIVERED', 'Gọi trước khi giao', 75.00),
(5, 'Hoàng Mai E', '0905678901', '654 Đường E, Quận 5, TP.HCM', '2024-10-05 14:00:00', 'INPROGRESS', 'Hãy cẩn thận khi giao', 80.00),
(6, 'Đặng Minh F', '0906789012', '987 Đường F, Quận 6, TP.HCM', '2024-10-06 15:00:00', 'DELIVERED', 'Không có ghi chú', 60.00),
(7, 'Phạm Thúy G', '0907890123', '135 Đường G, Quận 7, TP.HCM', '2024-10-07 16:00:00', 'INPROGRESS', 'Giao tận nơi', 55.00),
(8, 'Võ Huy H', '0908901234', '246 Đường H, Quận 8, TP.HCM', '2024-10-08 17:00:00', 'DELIVERED', 'Giao vào cuối tuần', 150.00),
(9, 'Lưu Trí I', '0909012345', '369 Đường I, Quận 9, TP.HCM', '2024-10-09 18:00:00', 'INPROGRESS', 'Giao lúc 10 giờ', 130.00),
(10, 'Bạch Ngọc J', '0900123456', '147 Đường J, Quận 10, TP.HCM', '2024-10-10 19:00:00', 'DELIVERED', 'Gói hàng cẩn thận', 70.00);

INSERT INTO orderItems (order_items_quantity, order_items_product_id, order_items_size_id) VALUES
(1, 1, 40),
(2, 2, 41),
(1, 3, 39),
(1, 4, 42),
(2, 5, 43),
(1, 6, 44),
(1, 7, 38),
(1, 8, 45),
(2, 9, 40),
(1, 10, 41);

INSERT INTO cart (cart_customer_id) VALUES
(1),
(2),
(3),
(4),
(5),
(6),
(7),
(8),
(9),
(10);

INSERT INTO cartDetail (cartDetail_cartId, cartDetail_productId, cartDetail_sizeId, cart_detail_quantity) VALUES
(1, 1, 40, 1),
(2, 2, 41, 2),
(3, 3, 39, 1),
(4, 4, 42, 1),
(5, 5, 43, 2),
(6, 6, 44, 1),
(7, 7, 38, 1),
(8, 8, 45, 1),
(9, 9, 40, 2),
(10, 10, 41, 1);
