package com.course.coursemc.config;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.course.coursemc.domain.Categoria;
import com.course.coursemc.domain.Cidade;
import com.course.coursemc.domain.Cliente;
import com.course.coursemc.domain.Endereco;
import com.course.coursemc.domain.Estado;
import com.course.coursemc.domain.ItemPedido;
import com.course.coursemc.domain.Pagamento;
import com.course.coursemc.domain.PagamentoComBoleto;
import com.course.coursemc.domain.PagamentoComCartao;
import com.course.coursemc.domain.Pedido;
import com.course.coursemc.domain.Produto;
import com.course.coursemc.domain.enums.EstadoPagamento;
import com.course.coursemc.domain.enums.TipoCliente;
import com.course.coursemc.repositories.CategoriaRepository;
import com.course.coursemc.repositories.CidadeRepository;
import com.course.coursemc.repositories.ClienteRepository;
import com.course.coursemc.repositories.EnderecoRepository;
import com.course.coursemc.repositories.EstadoRepository;
import com.course.coursemc.repositories.ItemPedidoRepository;
import com.course.coursemc.repositories.PagamentoRepository;
import com.course.coursemc.repositories.PedidoRepository;
import com.course.coursemc.repositories.ProdutoRepository;
import com.course.coursemc.services.DBService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService dbService;

	@Bean
	public boolean instantiateDatabase() throws ParseException {
		dbService.instantiateTestDatabase();
		return true;
	}

}
