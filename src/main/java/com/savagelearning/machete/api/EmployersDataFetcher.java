package com.savagelearning.machete.api;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import com.savagelearning.jooq.tables.pojos.Employers;

public class EmployersDataFetcher implements DataFetcher<Employers> {
    private final String template;
    private final String defaultName;
    // private final AtomicLong counter = new AtomicLong();
  
    public EmployersDataFetcher(String template, String defaultName) {
      this.template = template;
      this.defaultName = defaultName;
    }
  
    @Override
    public Employers get(DataFetchingEnvironment environment) {
    //   final Optional<String> name = Optional.ofNullable(environment.getArgument("name"));
    //   final String value = String.format(template, name.orElse(defaultName));
      return new Employers();
    }
}
