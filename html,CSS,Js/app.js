const mysql = require('mysql');

// Connection credentials
const connection = mysql.createConnection({
  host: 'localhost',
  user: 'atulrawat@localhost',
  password: '12345',
  database: 'firstweb.indexx'
});

// Connect to MySQL
connection.connect((err) => {
  if (err) {
    console.error('Error connecting to MySQL: ' + err.stack);
    return;
  }

  console.log('Connected to MySQL as id ' + connection.threadId);

  // Sample SQL query
  connection.query('SELECT * FROM your_table_name', (err, rows) => {
    if (err) {
      console.error('Error executing query: ' + err.stack);
      return;
    }

    console.log('Query result:');
    console.log(rows);

    // Do something with the query result here
  });

  // Close the connection
  connection.end((err) => {
    if (err) {
      console.error('Error closing connection: ' + err.stack);
      return;
    }

    console.log('Connection closed.');
  });
});
