import Chocolate from "./Chocolate";

const   ChocolateList = ({chocolates, deleteChocolate}) => {

    // mapping through array of chocolates and making each chocolate a component(prop)
    const chocolateComponents = chocolates.map((chocolate) => {
        return <Chocolate key={chocolate.id} chocolate={chocolate} />;

    });

    return (
        <>
            <h2>chocolates</h2>
            <hr />
            {chocolateComponents}
            deleteChocolate={deleteChocolate}

        </>
    );
};

export default ChocolateList;