import React, {useState} from "react";
import Users from "./components/Users";
import Register from "./components/Register";

// state needs to be held high up in our tree since we will need its data below in components

const App = () => {
  
  const [users, setUsers] = useState([
    {
      username: "nemo1",
      email: "nemo1@gmail.com",
      password: "secret1",
      confirmPassowrd: "secret1"
    },
    { 
      username: "dorine3",
      email: "dorine3@gmail.com",
      password: "ilovethesea4",
      confirmPassowrd: "ilovethesea4"
    }
  ]);

  // implementing the addNewUser() function
  const addNewUser = (newUser) => {
    // ... is destructuring, means make me a copy of new users
    setUsers([...users, newUser]);
  }

  return (
    <div>
      <Users users={users} />
      <Register addNewUser={addNewUser}/>
    </div>
  );
};

export default App;
