# Practice Project

Dự án mẫu này được xây dựng để minh họa việc áp dụng **Coding Convention** vào một dự án Java. Cấu trúc dự án tuân theo mô hình **Package by Domain** để tối ưu hóa khả năng bảo trì và mở rộng.

## Mục tiêu

* Thực hành tuân thủ nghiêm ngặt các quy tắc coding convention.
* Làm quen với các tính năng mới của Java 17 (Text Blocks, Switch Expressions) trong khuôn khổ Style Guide.

## Yêu cầu hệ thống

* **Java:** JDK 17
* **IDE:** IntelliJ IDEA

## Cấu trúc dự án (Package by Domain)

Dự án áp dụng quy tắc đặt tên package là chữ thường viết liền và phân chia theo nghiệp vụ:

```text
src/me/trangiahuy/demo/
├── StyleGuideDemo.java     # Class minh họa
└── ResponseState.java      # Enum class minh hoạ
