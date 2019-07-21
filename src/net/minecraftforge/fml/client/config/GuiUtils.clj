(ns net.minecraftforge.fml.client.config.GuiUtils
  "This class provides several methods and constants used by the Config GUI classes."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiUtils]))

(defn ->gui-utils
  "Constructor."
  (^GuiUtils []
    (new GuiUtils )))

(def *-undo-char
  "Static Constant.

  type: java.lang.String"
  GuiUtils/UNDO_CHAR)

(def *-reset-char
  "Static Constant.

  type: java.lang.String"
  GuiUtils/RESET_CHAR)

(def *-valid
  "Static Constant.

  type: java.lang.String"
  GuiUtils/VALID)

(def *-invalid
  "Static Constant.

  type: java.lang.String"
  GuiUtils/INVALID)

(defn *-color-codes
  "Static Field.

  type: int[]"
  []
  GuiUtils/colorCodes)

(defn *get-color-code
  "c - `char`
  is-lighter - `boolean`

  returns: `int`"
  (^Integer [^Character c ^Boolean is-lighter]
    (GuiUtils/getColorCode c is-lighter)))

(defn *draw-continuous-textured-box
  "Draws a textured box of any size (smallest size is borderSize * 2 square) based on a fixed size textured box with continuous borders
   and filler. The provided ResourceLocation object will be bound using
   Minecraft.getMinecraft().getTextureManager().bindTexture(resourceLocation).

  res - the ResourceLocation object that contains the desired image - `net.minecraft.util.ResourceLocation`
  x - x axis offset - `int`
  y - y axis offset - `int`
  u - bound resource location image x offset - `int`
  v - bound resource location image y offset - `int`
  width - the desired box width - `int`
  height - the desired box height - `int`
  texture-width - the width of the box texture in the resource location image - `int`
  texture-height - the height of the box texture in the resource location image - `int`
  top-border - the size of the box's top border - `int`
  bottom-border - the size of the box's bottom border - `int`
  left-border - the size of the box's left border - `int`
  right-border - the size of the box's right border - `int`
  z-level - the zLevel to draw at - `float`"
  ([^net.minecraft.util.ResourceLocation res ^Integer x ^Integer y ^Integer u ^Integer v ^Integer width ^Integer height ^Integer texture-width ^Integer texture-height ^Integer top-border ^Integer bottom-border ^Integer left-border ^Integer right-border ^Float z-level]
    (GuiUtils/drawContinuousTexturedBox res x y u v width height texture-width texture-height top-border bottom-border left-border right-border z-level))
  ([^Integer x ^Integer y ^Integer u ^Integer v ^Integer width ^Integer height ^Integer texture-width ^Integer texture-height ^Integer top-border ^Integer bottom-border ^Integer left-border ^Integer right-border ^Float z-level]
    (GuiUtils/drawContinuousTexturedBox x y u v width height texture-width texture-height top-border bottom-border left-border right-border z-level))
  ([^net.minecraft.util.ResourceLocation res ^Integer x ^Integer y ^Integer u ^Integer v ^Integer width ^Integer height ^Integer texture-width ^Integer texture-height ^Integer border-size ^Float z-level]
    (GuiUtils/drawContinuousTexturedBox res x y u v width height texture-width texture-height border-size z-level))
  ([^Integer x ^Integer y ^Integer u ^Integer v ^Integer width ^Integer height ^Integer texture-width ^Integer texture-height ^Integer border-size ^Float z-level]
    (GuiUtils/drawContinuousTexturedBox x y u v width height texture-width texture-height border-size z-level)))

(defn *draw-textured-modal-rect
  "x - `int`
  y - `int`
  u - `int`
  v - `int`
  width - `int`
  height - `int`
  z-level - `float`"
  ([^Integer x ^Integer y ^Integer u ^Integer v ^Integer width ^Integer height ^Float z-level]
    (GuiUtils/drawTexturedModalRect x y u v width height z-level)))

(defn *pre-item-tool-tip
  "Must be called from GuiScreen.renderToolTip before GuiScreen.drawHoveringText is called.

  stack - The stack for which a tooltip is about to be drawn. - `net.minecraft.item.ItemStack`"
  ([^net.minecraft.item.ItemStack stack]
    (GuiUtils/preItemToolTip stack)))

(defn *post-item-tool-tip
  "Must be called from GuiScreen.renderToolTip after GuiScreen.drawHoveringText is called."
  ([]
    (GuiUtils/postItemToolTip )))

(defn *draw-hovering-text
  "Use this version if calling from somewhere where ItemStack context is available.

  stack - `net.minecraft.item.ItemStack`
  text-lines - `java.util.List`
  mouse-x - `int`
  mouse-y - `int`
  screen-width - `int`
  screen-height - `int`
  max-text-width - `int`
  font - `net.minecraft.client.gui.FontRenderer`"
  ([^net.minecraft.item.ItemStack stack ^java.util.List text-lines ^Integer mouse-x ^Integer mouse-y ^Integer screen-width ^Integer screen-height ^Integer max-text-width ^net.minecraft.client.gui.FontRenderer font]
    (GuiUtils/drawHoveringText stack text-lines mouse-x mouse-y screen-width screen-height max-text-width font))
  ([^java.util.List text-lines ^Integer mouse-x ^Integer mouse-y ^Integer screen-width ^Integer screen-height ^Integer max-text-width ^net.minecraft.client.gui.FontRenderer font]
    (GuiUtils/drawHoveringText text-lines mouse-x mouse-y screen-width screen-height max-text-width font)))

(defn *draw-gradient-rect
  "z-level - `int`
  left - `int`
  top - `int`
  right - `int`
  bottom - `int`
  start-color - `int`
  end-color - `int`"
  ([^Integer z-level ^Integer left ^Integer top ^Integer right ^Integer bottom ^Integer start-color ^Integer end-color]
    (GuiUtils/drawGradientRect z-level left top right bottom start-color end-color)))

