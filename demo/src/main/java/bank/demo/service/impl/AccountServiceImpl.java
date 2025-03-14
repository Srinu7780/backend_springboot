package bank.demo.service.impl;

import bank.demo.service.AccountService;
import bank.demo.dto.AccountDto;
import bank.demo.entity.Account;
import bank.demo.mapper.AccountMapper;
import bank.demo.repository.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Autowired  // Constructor injection
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) { // Fixed method signature
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountById(Long id) {
        Account account= accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account does not exits"));
        return AccountMapper.mapToAccountDto(account);
    }
}
