CREATE TABLE `product` (
    `id` INT AUTO_INCREMENT PRIMARY KEY COMMENT '商品ID',
    `name` VARCHAR(255) NOT NULL COMMENT '商品名称',
    `description` TEXT COMMENT '商品描述',
    `price` DECIMAL(10, 2) NOT NULL COMMENT '商品价格',
    `stock_quantity` INT DEFAULT 0 COMMENT '库存数量',
    `category_id` INT COMMENT '商品分类ID',
    `product_code` VARCHAR(50) NOT NULL UNIQUE COMMENT '商品编码，唯一标识商品',
    `image_url` VARCHAR(255) COMMENT '商品图片URL',
    `stock_warning_threshold` INT DEFAULT 10 COMMENT '库存预警阈值，低于此数量时触发预警',
    `status` TINYINT(1) DEFAULT 1 COMMENT '商品状态 1：正常 0：下架',
    `created_at` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT='商品信息表';
CREATE TABLE `category` (
    `id` INT AUTO_INCREMENT PRIMARY KEY COMMENT '分类ID',
    `name` VARCHAR(255) NOT NULL COMMENT '分类名称',
    `description` TEXT COMMENT '分类描述',
    `parent_id` INT DEFAULT 0 COMMENT '父级分类ID，0表示顶级分类',
    `status` TINYINT(1) DEFAULT 1 COMMENT '分类状态 1：启用 0：禁用',
    `created_at` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT='商品分类表';
CREATE TABLE `claim` (
    `id` INT AUTO_INCREMENT PRIMARY KEY COMMENT '申领单ID',
    `user_id` INT NOT NULL COMMENT '用户ID，指向员工表',
    `product_id` INT NOT NULL COMMENT '商品ID，指向商品表',
    `quantity` INT NOT NULL COMMENT '申领数量',
    `status` TINYINT(1) DEFAULT 0 COMMENT '申领单状态 0：待审核 1：已审核 2：已发货',
    `created_at` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT='申领单表';
