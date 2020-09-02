# London API V2

A reimplementation of the [London API](https://github.com/ASweilam/londonapi).

## What is different?
This API uses a PostGreSQL database as a datasource rather than an external API. It is a proof-of-concept on utilising a different datasource. This is to avoid the situation where the external API may be down at some point. 

- CRUD operations
- Get users who are within 50 Miles of London.

## Endpoints

- Get all users stored on the database:
```bash
http://localhost:8080/api/v2/users
```

- Get all users who are within 50 Miles of London
```bash
http://localhost:8080//api/v2/users/london
```

- Get specific user by their ID
```bash
http://localhost:8080//api/v2/users/{id}
```

- Create a new user using a POST request. Make sure to add the new user's JSON data in the body of the request.
```bash
http://localhost:8080//api/v2/users
```

- Update a specific user. You will not be able to update the ID. This should be a PUT Request. Make sure to add the new user's JSON data in the body of the request. 
```bash
http://localhost:8080//api/v2/users/{id}
```

- Delete a specific user. Make sure it is a DELETE Request.
```bash
http://localhost:8080//api/v2/users/{id}
```


## Installation

- Clone the project.

```bash
$ git clone https://github.com/ASweilam/london_v2.git
```

- The project uses PostGreSQL as a datasource. Download and install [PostGreSQL](https://www.postgresql.org/download/).

- Inside the resources folder in the project there is a DbScripts folder. This contains the SQL scripts to create the required table and insert the data into the table.

```bash
src/main/resources/DbScripts
```
- Go to application.properties file inside the project to change the database username and password to correspond to your setup of the database.

- Make sure to install the Maven dependencies before running the application
```bash
mvn clean install
```

## Contributing
Pull requests are welcome.


## License
[MIT](https://choosealicense.com/licenses/mit/)
