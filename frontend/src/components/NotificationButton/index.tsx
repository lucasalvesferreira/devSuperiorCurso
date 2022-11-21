import axios from 'axios';
import icon from "../../assets/img/notification-icon.svg";
import { BASE_URL } from '../../utils/request';

import './styles.css';


type Props = {
        saleId: number;
}
function handreClick(id :number){
    axios(`${BASE_URL}/sales/${id}/notification`)
    .then(response =>{

    });

}

function NotificationButton({saleId} : Props ) {
    return (
        <div className="dsmeta-red-btn" onClick={() => handreClick(saleId)}>
            <img src={icon} alt="Notificar" />
        </div>
    )
}

export default NotificationButton;
