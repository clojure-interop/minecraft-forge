(ns net.minecraftforge.fml.client.GuiJava8Error
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client GuiJava8Error]))

(defn ->gui-java-8-error
  "Constructor.

  java-8-version-exception - `net.minecraftforge.fml.common.Java8VersionException`"
  (^GuiJava8Error [^net.minecraftforge.fml.common.Java8VersionException java-8-version-exception]
    (new GuiJava8Error java-8-version-exception)))

(defn init-gui
  ""
  ([^GuiJava8Error this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiJava8Error this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

