import { Link } from "react-router-dom";

const Chocolate = ({chocolate, deleteChocolate}) => {


    const handleDeleteChocolate = () => {
        deleteChocolate(chocolate.id);
    }

    return (
        <>
            <h4>{chocolate.name}</h4>
            <p>Estate: {chocolate.estate.name}</p>
            <p>Cocoa %: {chocolate.cocoaPercentage}</p>
            <button onClick={handleDeleteChocolate}>
                delete
            </button>
            <button>
            <Link to={`/edit-chocolate/${chocolate.id}`}>Edit</Link>
            </button>
            <hr />
        </>
    )
}

export default Chocolate;