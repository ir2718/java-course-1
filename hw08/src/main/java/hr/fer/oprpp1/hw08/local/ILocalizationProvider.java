package hr.fer.oprpp1.hw08.local;

public interface ILocalizationProvider {

	public void addLocalizationListener(ILocalizationListener l);
	public void removeLocalizationListener(ILocalizationListener l);
	public String getString(String key);
	public String getCurrentLanguage();
	
}
