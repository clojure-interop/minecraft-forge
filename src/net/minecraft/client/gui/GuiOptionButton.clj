(ns net.minecraft.client.gui.GuiOptionButton
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiOptionButton]))

(defn ->gui-option-button
  "Constructor.

  p-i-45012-1 - `int`
  p-i-45012-2 - `int`
  p-i-45012-3 - `int`
  p-i-45012-4 - `int`
  p-i-45012-5 - `int`
  p-i-45012-6 - `java.lang.String`"
  (^GuiOptionButton [^Integer p-i-45012-1 ^Integer p-i-45012-2 ^Integer p-i-45012-3 ^Integer p-i-45012-4 ^Integer p-i-45012-5 ^java.lang.String p-i-45012-6]
    (new GuiOptionButton p-i-45012-1 p-i-45012-2 p-i-45012-3 p-i-45012-4 p-i-45012-5 p-i-45012-6))
  (^GuiOptionButton [^Integer p-i-45013-1 ^Integer p-i-45013-2 ^Integer p-i-45013-3 ^net.minecraft.client.settings.GameSettings$Options p-i-45013-4 ^java.lang.String p-i-45013-5]
    (new GuiOptionButton p-i-45013-1 p-i-45013-2 p-i-45013-3 p-i-45013-4 p-i-45013-5))
  (^GuiOptionButton [^Integer p-i-45011-1 ^Integer p-i-45011-2 ^Integer p-i-45011-3 ^java.lang.String p-i-45011-4]
    (new GuiOptionButton p-i-45011-1 p-i-45011-2 p-i-45011-3 p-i-45011-4)))

(defn return-enum-options
  "returns: `net.minecraft.client.settings.GameSettings$Options`"
  (^net.minecraft.client.settings.GameSettings$Options [^GuiOptionButton this]
    (-> this (.returnEnumOptions))))

