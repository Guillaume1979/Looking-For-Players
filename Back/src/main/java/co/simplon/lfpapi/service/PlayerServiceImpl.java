package co.simplon.lfpapi.service;

import co.simplon.lfpapi.exception.InvalidPlayerException;
import co.simplon.lfpapi.model.Player;
import co.simplon.lfpapi.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {

    private PlayerRepository playerRepository;

    public PlayerServiceImpl (PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    @Override
    public Player getOnePlayer(Long idPlayer) {
        Optional<Player> playerInBase = this.playerRepository.findById(idPlayer);
        if (playerInBase.isPresent()) {
            return playerInBase.get();
        } else {
            throw new InvalidPlayerException();
        }
    }

    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public Player savePlayer(Long idPlayer, Player player) {
        Optional<Player> playerInBase = this.playerRepository.findById(idPlayer);
        if (playerInBase.isPresent()){
            return this.playerRepository.save(player);
        } else {
            throw new InvalidPlayerException();
        }
    }

    @Override
    public Player createPlayer(Player player) {
        return this.playerRepository.save(player);
    }

    @Override
    public void deletePlayer(Long idPlayer) {
        this.playerRepository.deleteById(idPlayer);
    }
}
