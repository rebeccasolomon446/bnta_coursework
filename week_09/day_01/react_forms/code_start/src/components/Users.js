const Users = ({users}) => {
  return (
    <ul>
      {users.map((user) => (
        // key: unique idenfifier to each user
        // need a key everyime we use map
        <li key={user.email}>
          {user.username} - {user.email}
        </li>
      ))}
    </ul>
  );
};

export default Users;
