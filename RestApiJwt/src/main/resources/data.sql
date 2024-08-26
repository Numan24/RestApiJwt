create table users (id integer primary key, nameofuser text, password text, email text, gender text, status text);

create table userposts (id integer primary key, userid integer, title text, body text, CONSTRAINT fk_department
        FOREIGN KEY (userid)
        REFERENCES users(id));

create table usercomments (id integer primary key, postid integer, CONSTRAINT fk_department
        FOREIGN KEY (postid)
        REFERENCES userposts(id));

CREATE SEQUENCE user_id_seq START WITH 1 INCREMENT BY 1;


insert into users values (2, 'numan', 'n@234', 'numan@gmail.com', 'male', 'active');
insert into userposts values (1, 2, 'Suscipio ipsum utrimque arca turpe sub', 'Umbra aeger degero. Amaritudo quibusdam bonus. Conicio subseco suscipio. Vigilo contra tertius. Alias harum animus. Defaeco subvenio vito. Qui titulus adsum. Calamitas claustrum via. Ullam aperte audeo. Occaecati abeo tribuo. Trado audio adversus');
insert into usercomments values (1, 1);

select * from users;
select * from userposts;
select * from usercomments;

