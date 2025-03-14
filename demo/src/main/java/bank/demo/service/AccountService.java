package bank.demo.service;
import bank.demo.dto.AccountDto;

public interface AccountService
{
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);
}
