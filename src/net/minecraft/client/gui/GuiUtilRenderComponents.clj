(ns net.minecraft.client.gui.GuiUtilRenderComponents
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiUtilRenderComponents]))

(defn ->gui-util-render-components
  "Constructor."
  (^GuiUtilRenderComponents []
    (new GuiUtilRenderComponents )))

(defn *remove-text-colors-if-configured
  "text - `java.lang.String`
  force-color - `boolean`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String text ^Boolean force-color]
    (GuiUtilRenderComponents/removeTextColorsIfConfigured text force-color)))

(defn *split-text
  "text-component - `net.minecraft.util.text.ITextComponent`
  max-text-lenght - `int`
  font-renderer-in - `net.minecraft.client.gui.FontRenderer`
  p-178908-3 - `boolean`
  force-text-color - `boolean`

  returns: `java.util.List<net.minecraft.util.text.ITextComponent>`"
  (^java.util.List [^net.minecraft.util.text.ITextComponent text-component ^Integer max-text-lenght ^net.minecraft.client.gui.FontRenderer font-renderer-in ^Boolean p-178908-3 ^Boolean force-text-color]
    (GuiUtilRenderComponents/splitText text-component max-text-lenght font-renderer-in p-178908-3 force-text-color)))

