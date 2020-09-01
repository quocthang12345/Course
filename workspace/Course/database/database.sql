INSERT INTO user(fullname,password,status,username,history_id) VALUES('Trần Quốc Thắng' , '$2a$10$esr5CFZ0Conoh.k/DMa6PetRsVVLtt7Zap5V5N9TtyqzrYh9dWcGm',
'1','admin','1');

INSERT INTO user(fullname,password,status,username,history_id) VALUES('Trần Thị Phương Thảo' , '$2a$10$9xmg.gnJd83.ZoWPGvV6g.NVHR6mradbkUheCo.uRFFi68hT2Dkem',
'1','user','2');

INSERT INTO user_roles(user_id,role_id) VALUES('3','1');
INSERT INTO user_roles(user_id,role_id) VALUES('4','2');