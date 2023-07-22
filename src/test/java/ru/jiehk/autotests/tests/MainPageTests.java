package ru.jiehk.autotests.tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.jiehk.autotests.pages.AdvancedSearchPage;
import ru.jiehk.autotests.pages.MainPage;
import ru.jiehk.autotests.pages.SearchResultsPage;

public class MainPageTests extends TestBase {

    public static final String SEARCHPLACEHOLDER = "Профессия, должность или компания";
    public static final String SEARCHREQUEST = "qa";
    public static final String SEARCHTITLE = "Работа найдётся для каждого";
    public static final String ADVANCEDSEARCHPAGETITLE = "Поиск вакансий";
    MainPage mainPage = new MainPage();
    AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();

    @Test
    @DisplayName("Отображение строки поиска на главной странице")
    void searchBarTest() {
        mainPage
                .openMainPage()
                .searchBarDisplayingCheck();
    }

    @Test
    @DisplayName("Проверка плейсхолдера строки поиска на главной странице")
    void searchBarPlaceholderTest() {
        mainPage
                .openMainPage()
                .searchBarPlaceHolderCheck(SEARCHPLACEHOLDER);
    }

    @Test
    @DisplayName("Переход на страницу результатов поиска при выполнении поиска с главной страницы")
    void searchTest() {
        mainPage
                .openMainPage()
                .searchBarSetValue(SEARCHREQUEST)
                .searchButtonClick();
        searchResultsPage.openSearchResultsPageCheck(SEARCHREQUEST);
    }

    @Test
    @DisplayName("Переход на страницу расширенного поиска с главной страницы")
    void advancedSearchTest() {
        mainPage
                .openMainPage()
                .advancedSearchButtonClick();
        advancedSearchPage.openSearchResultsPageCheck(ADVANCEDSEARCHPAGETITLE);
    }

    @Test
    @DisplayName("Отображение поисковых подсказок на главной странице")
    void suggestsTest() {
        mainPage
                .openMainPage()
                .searchBarSetValue(SEARCHREQUEST)
                .searchSuggestsCheck(SEARCHREQUEST);
    }

    @Test
    @DisplayName("Проверка заголовка строки поиска на главной странице")
    void searchBarTitleTest() {
        mainPage
                .openMainPage()
                .searchBarTitleCheck(SEARCHTITLE);
    }

    @Test
    @DisplayName("Отображение popup подтверждения региона на главной странице")
    void regionPopupTest() {
        mainPage
                .openMainPage()
                .regionPopupCheck();
    }

    @Test
    @Disabled
    @DisplayName("Отсутствие ошибок в логах консоли")
    void consoleShouldNotHaveErrorsTest() {
        mainPage
                .openMainPage()
                .consoleErrorsCheck();
    }
}