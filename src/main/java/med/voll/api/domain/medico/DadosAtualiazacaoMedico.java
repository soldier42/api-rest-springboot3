package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotNull;

public record DadosAtualiazacaoMedico(@NotNull Long id,
                                        String nome,
                                        String telefone,
                                        DadosEndereco endereco) {
}
