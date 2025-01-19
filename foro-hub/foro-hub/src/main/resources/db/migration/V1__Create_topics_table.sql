CREATE TABLE topics (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    message TEXT NOT NULL,
    creation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status ENUM('active', 'closed') NOT NULL,
    author BIGINT NOT NULL,
    course VARCHAR(255)
);