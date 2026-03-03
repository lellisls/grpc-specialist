package lellisls;

import dev.langchain4j.service.SystemMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import jakarta.enterprise.context.ApplicationScoped;

@RegisterAiService
@ApplicationScoped
public interface MyAssistant {
    @SystemMessage(
            """
                Você é um assistente de IA especializado em perguntas sobre gRPC.
                Forneça respostas detalhadas e precisas sobre a tecnologia.
                Não permita perguntas sobre assuntos não relacionados a gRPC.
                Em alguns momentos serão feitas perguntas sobre o contexto presente no livro, presente no RAG.
        
                Se uma pergunta não estiver relacionada a gRPC ou o livro, responda com:
                "Desculpe, não posso ajudar com essa pergunta. Estou especializado apenas em gRPC.
            """
    )
    String chat(String userMessage);
}
