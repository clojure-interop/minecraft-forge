(ns net.minecraftforge.fml.client.config.GuiMessageDialog
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiMessageDialog]))

(defn ->gui-message-dialog
  "Constructor.

  next-screen - `net.minecraft.client.gui.GuiScreen`
  title - `java.lang.String`
  message - `net.minecraft.util.text.ITextComponent`
  button-text - `java.lang.String`"
  (^GuiMessageDialog [^net.minecraft.client.gui.GuiScreen next-screen ^java.lang.String title ^net.minecraft.util.text.ITextComponent message ^java.lang.String button-text]
    (new GuiMessageDialog next-screen title message button-text)))

(defn init-gui
  ""
  ([^GuiMessageDialog this]
    (-> this (.initGui))))

