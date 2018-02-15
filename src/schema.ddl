
    create table Expences (
        expenceId integer not null,
        amount bigint not null,
        description varchar(255),
        primary key (expenceId)
    );

    create table Groups (
        groupId integer not null,
        groupName varchar(255),
        primary key (groupId)
    );

    create table User (
        userId integer not null,
        amountLent bigint not null,
        amountOwes bigint not null,
        userName varchar(255),
        primary key (userId)
    );
