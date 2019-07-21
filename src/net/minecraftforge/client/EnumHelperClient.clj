(ns net.minecraftforge.client.EnumHelperClient
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client EnumHelperClient]))

(defn ->enum-helper-client
  "Constructor."
  (^EnumHelperClient []
    (new EnumHelperClient )))

(defn *add-game-type
  "name - `java.lang.String`
  id - `int`
  display-name - `java.lang.String`
  short-name - `java.lang.String`

  returns: `net.minecraft.world.GameType`"
  (^net.minecraft.world.GameType [^java.lang.String name ^Integer id ^java.lang.String display-name ^java.lang.String short-name]
    (EnumHelperClient/addGameType name id display-name short-name)))

(defn *add-options
  "name - `java.lang.String`
  lang-name - `java.lang.String`
  is-slider - `boolean`
  is-toggle - `boolean`
  val-min - `float`
  val-max - `float`
  val-step - `float`

  returns: `net.minecraft.client.settings.GameSettings$Options`"
  (^net.minecraft.client.settings.GameSettings$Options [^java.lang.String name ^java.lang.String lang-name ^Boolean is-slider ^Boolean is-toggle ^Float val-min ^Float val-max ^Float val-step]
    (EnumHelperClient/addOptions name lang-name is-slider is-toggle val-min val-max val-step))
  (^net.minecraft.client.settings.GameSettings$Options [^java.lang.String name ^java.lang.String lang-name ^Boolean is-slider ^Boolean is-toggle]
    (EnumHelperClient/addOptions name lang-name is-slider is-toggle)))

(defn *add-os-2
  "name - `java.lang.String`

  returns: `net.minecraft.util.Util$EnumOS`"
  (^net.minecraft.util.Util$EnumOS [^java.lang.String name]
    (EnumHelperClient/addOS2 name)))

