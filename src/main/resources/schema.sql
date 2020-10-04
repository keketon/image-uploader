use image_uploader;

create table if not exists image_uploader(
    id bigint unsigned primary key not null auto_increment comment 'ID'
)
comment '画像用テーブル';