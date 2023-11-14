CREATE TABLE person(
    person_id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    firstame VARCHAR(50) NOT NULL,
    lastname VARCHAR(50) NOT NULL
);

CREATE TABLE connection(
    person_id1 INTEGER NOT NULL,
    person_id2 INTEGER NOT NULL,
    PRIMARY KEY(person_id1,person_id2),
    FOREIGN KEY (person_id1) REFERENCES person(person_id),
    FOREIGN KEY (person_id2) REFERENCES person(person_id)
);

CREATE TABLE bank_account_number(
    account_nb VARCHAR(50) NOT NULL PRIMARY KEY
);

CREATE TABLE assoc_person_bank_account_number(
    person_id INTEGER NOT NULL,
    account_nb VARCHAR(50) NOT NULL,
    PRIMARY KEY (person_id,account_nb),
	FOREIGN KEY (person_id) REFERENCES person(person_id),
    FOREIGN KEY (account_nb) REFERENCES bank_account_number(account_nb)
);

CREATE TABLE role(
    role_id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    role VARCHAR(10) NOT NULL
);

CREATE TABLE assoc_person_role(
    person_id INTEGER NOT NULL,
    role_id INTEGER NOT NULL,
    PRIMARY KEY(person_id,role_id),
    FOREIGN KEY (person_id) REFERENCES person(person_id),
    FOREIGN KEY (role_id) REFERENCES role(role_id)

);

CREATE TABLE login(
    person_id INTEGER NOT NULL PRIMARY KEY,
    email VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(50) NOT NULL,
    FOREIGN KEY (person_id) REFERENCES person(person_id)
);

CREATE TABLE bank_transaction(
    person_id INTEGER NOT NULL,
    transaction_id INTEGER NOT NULL,
    amount DECIMAL (10.2) NOT NULL,
    operation VARCHAR(10)NOT NULL,
    description VARCHAR(255),
    PRIMARY KEY(person_id,transaction_id),
    FOREIGN KEY (person_id) REFERENCES person(person_id)
);

CREATE TABLE application_transaction(
    sender_id INTEGER NOT NULL,
    recipient_id INTEGER NOT NULL,
    transaction_id INTEGER NOT NULL,
    amount DECIMAL (10.2) NOT NULL,
    fees DECIMAL (8.2) NOT NULL,
    description VARCHAR(255),
    PRIMARY KEY (sender_id,recipient_id,transaction_id),
    CONSTRAINT sender_id_not_equals_recipient_id CHECK (sender_id<>recipient_id),
    FOREIGN KEY (sender_id) REFERENCES person(person_id),
    FOREIGN KEY (recipient_id) REFERENCES person(person_id)
);