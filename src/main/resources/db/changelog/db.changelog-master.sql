create TABLE Account (
    accountId int primary key,
    nickname varchar(255) not null,
    gender varchar (255) not null,
);

create TABLE Story (
   storyId int primary key,
   authorId int not null,
   content varchar,

   FOREIGN KEY (authorId) REFERENCES Account(accountId)
)