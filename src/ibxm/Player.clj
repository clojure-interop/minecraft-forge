(ns ibxm.Player
  (:refer-clojure :only [require comment defn ->])
  (:import [ibxm Player]))

(defn ->player
  "Constructor.

  Instantiate a new Player.

  throws: javax.sound.sampled.LineUnavailableException"
  (^Player []
    (new Player )))

(defn *main
  "Simple command-line test player.

  args - `java.lang.String[]`

  throws: java.lang.Exception"
  ([args]
    (Player/main args)))

(defn *load-module
  "Decode the data in the specified InputStream into a Module instance.

  input - an InputStream containing the module file to be decoded. - `java.io.InputStream`

  returns: `ibxm.Module`

  throws: java.lang.IllegalArgumentException - if the data is not recognised as a module file."
  (^ibxm.Module [^java.io.InputStream input]
    (Player/load_module input)))

(defn set-module
  "Set the Module instance to be played.

  m - `ibxm.Module`"
  ([^Player this ^ibxm.Module m]
    (-> this (.set_module m))))

(defn set-loop
  "If loop is true, playback will continue indefinitely,
                  otherwise the module will play through once and stop.

  loop - `boolean`"
  ([^Player this ^Boolean loop]
    (-> this (.set_loop loop))))

(defn play
  "Open the audio device and begin playback.
                  If a module is already playing it will be restarted."
  ([^Player this]
    (-> this (.play))))

(defn stop
  "Stop playback and close the audio device."
  ([^Player this]
    (-> this (.stop))))

