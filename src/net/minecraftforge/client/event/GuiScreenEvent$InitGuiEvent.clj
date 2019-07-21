(ns net.minecraftforge.client.event.GuiScreenEvent$InitGuiEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event GuiScreenEvent$InitGuiEvent]))

(defn ->init-gui-event
  "Constructor.

  gui - `net.minecraft.client.gui.GuiScreen`
  button-list - `java.util.List`"
  (^GuiScreenEvent$InitGuiEvent [^net.minecraft.client.gui.GuiScreen gui ^java.util.List button-list]
    (new GuiScreenEvent$InitGuiEvent gui button-list)))

(defn get-button-list
  "The buttonList field from the GuiScreen object referenced by GuiScreenEvent.gui.

  returns: `java.util.List<net.minecraft.client.gui.GuiButton>`"
  (^java.util.List [^GuiScreenEvent$InitGuiEvent this]
    (-> this (.getButtonList))))

(defn set-button-list
  "button-list - `java.util.List`"
  ([^GuiScreenEvent$InitGuiEvent this ^java.util.List button-list]
    (-> this (.setButtonList button-list))))

