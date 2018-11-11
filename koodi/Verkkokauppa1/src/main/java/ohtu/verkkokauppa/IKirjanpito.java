package ohtu.verkkokauppa;

import java.util.List;

public interface IKirjanpito {
  List<String> getTapahtumat();
  void lisaaTapahtuma(String tapahtuma);
}