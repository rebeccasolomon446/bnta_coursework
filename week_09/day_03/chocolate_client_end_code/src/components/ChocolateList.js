import Chocolate from "./Chocolate";

const ChocolateList = ({ chocolates, deleteChocolate }) => {
  const chocolateComponents = chocolates.map((chocolate) => {
    return (
      <Chocolate
        key={chocolate.id}
        chocolate={chocolate}
        deleteChocolate={deleteChocolate}
      />
    );
  });

  return (
    <>
      <h2>Chocolates</h2>
      <hr />
      {chocolateComponents}
    </>
  );
};

export default ChocolateList;
