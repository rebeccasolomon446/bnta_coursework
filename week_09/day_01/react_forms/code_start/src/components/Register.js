import {useState} from "react";
// controlled components can also be containers. so we can keep states in compinents

const Register = ({addNewUser}) => {

// States
const [username, setUsername] = useState("");
const [email, setEmail] = useState("");
const [password, setPassword] = useState("");
const [confirmPassword, setConfirmPassword] = useState("");

// everytime something is submitted, it alwys needs to be handled.
const handleSubmit = (event) => {
  event.preventDefault();
  // use it to lift state. 
  // defined in App. js because thats where all our users are. We want to add to that lift

  const newUser= {
    username: username,
    email: email,
    password: password,
    confirmPassword: confirmPassword    
  }

  addNewUser(newUser);

}

 


  return (
    <div>
      <h2>Sign up</h2>
      <form onSubmit={handleSubmit}>
        <input type="text"
               name="username"
               placeholder="Username" 
               // event listener. every time there is a change in a form, its an event that can be captured in a function
               onChange={(event) => setUsername(event.target.value)}
               value={username}/>

        <input  type="email" 
                name="email" 
                placeholder="email" 
                onChange={(event) => setEmail(event.target.value)}
                value={email} />

        <input  type="password"        
                name="password"
                placeholder="Password" 
                onChange={(event) => setPassword(event.target.value)}
                value={password}/>

        <input  type="password"
                name="confirmPassword"
                placeholder="Confirm Password" 
                onChange={(event) => setConfirmPassword(event.target.value)}
                value={confirmPassword}/>

        <input  type="submit" 
                value="OK" />
      </form>
    


    </div>
  )
  
};

export default Register;
