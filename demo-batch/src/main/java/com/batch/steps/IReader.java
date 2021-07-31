package com.batch.steps;

import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import com.batch.dto.User;
//@Component
public class IReader implements ItemReader<List<User>> {

	 /*@Bean 
	  public FlatFileItemReader<User> itemReader() {
	  
		  FlatFileItemReader<User> flatFileItemReader = new FlatFileItemReader<>();
		  flatFileItemReader.setResource(new
		  FileSystemResource("src/main/resources/users.csv"));
		  flatFileItemReader.setName("CSV-Reader");
		  flatFileItemReader.setLinesToSkip(1);
		  flatFileItemReader.setLineMapper(lineMapper()); 
		  return flatFileItemReader; 
	  }*/
	  
	 /* @Bean 
	  public LineMapper<User> lineMapper() {
	  
	  DefaultLineMapper<User> defaultLineMapper = new DefaultLineMapper<>();
	  DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
	  
	  lineTokenizer.setDelimiter(","); lineTokenizer.setStrict(false);
	  lineTokenizer.setNames("id", "name", "dept", "salary");
	  
	  BeanWrapperFieldSetMapper<User> fieldSetMapper = new
	  BeanWrapperFieldSetMapper<>(); fieldSetMapper.setTargetType(User.class);
	  
	  defaultLineMapper.setLineTokenizer(lineTokenizer);
	  defaultLineMapper.setFieldSetMapper(fieldSetMapper);
	  
	  return defaultLineMapper; 
	  }*/

	  /*@Bean
	  DefaultLineMapper<List<User>> lineMapper() {
	      return new DefaultLineMapper<List<User>>() {
			@Override
			public List<User> mapLine(String line, int lineNumber) throws Exception {
				DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
				lineTokenizer.setDelimiter(","); 
				lineTokenizer.setStrict(false);
				lineTokenizer.setNames("id", "name", "dept", "salary");
				  
				BeanWrapperFieldSetMapper<User> fieldSetMapper = new
				BeanWrapperFieldSetMapper<>(); 
				fieldSetMapper.setTargetType(User.class);
				  
              List<User> data = new ArrayList<User>();
              for (String token : tokens) {
                  data.add(fieldSetMapper.);
              }
	              return data;
			}
	      };
	  }*/
	  
	@Override
	public List<User> read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		// TODO Auto-generated method stub
		return null;
	}

}
