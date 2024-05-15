import mysql from 'mysql2/promise';


async function main() {
  const connection = await mysql.createConnection({
    port: 3306,
    host: 'localhost',
    user: 'root',
    password: '123456',
    database: 'fleet',
    charset: 'utf8_general_ci'
  });

  // query database
  const [rows, fields] = await connection.execute('SELECT * FROM `table` WHERE `name` = ? AND `age` > ?', ['Morty', 14]);

  await connection.end();
}

