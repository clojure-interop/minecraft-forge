(ns net.minecraftforge.fml.client.GuiScrollingList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client GuiScrollingList]))

(defn ->gui-scrolling-list
  "Constructor.

  client - `net.minecraft.client.Minecraft`
  width - `int`
  height - `int`
  top - `int`
  bottom - `int`
  left - `int`
  entry-height - `int`
  screen-width - `int`
  screen-height - `int`"
  (^GuiScrollingList [^net.minecraft.client.Minecraft client ^Integer width ^Integer height ^Integer top ^Integer bottom ^Integer left ^Integer entry-height ^Integer screen-width ^Integer screen-height]
    (new GuiScrollingList client width height top bottom left entry-height screen-width screen-height))
  (^GuiScrollingList [^net.minecraft.client.Minecraft client ^Integer width ^Integer height ^Integer top ^Integer bottom ^Integer left ^Integer entry-height]
    (new GuiScrollingList client width height top bottom left entry-height)))

(defn func-27258-a
  "Deprecated.

  p-27258-1 - `boolean`"
  ([^GuiScrollingList this ^Boolean p-27258-1]
    (-> this (.func_27258_a p-27258-1))))

(defn func-27256-c
  "Deprecated.

  x - `int`
  y - `int`

  returns: `int`"
  (^Integer [^GuiScrollingList this ^Integer x ^Integer y]
    (-> this (.func_27256_c x y))))

(defn register-scroll-buttons
  "buttons - `java.util.List`
  up-action-id - `int`
  down-action-id - `int`"
  ([^GuiScrollingList this ^java.util.List buttons ^Integer up-action-id ^Integer down-action-id]
    (-> this (.registerScrollButtons buttons up-action-id down-action-id))))

(defn action-performed
  "button - `net.minecraft.client.gui.GuiButton`"
  ([^GuiScrollingList this ^net.minecraft.client.gui.GuiButton button]
    (-> this (.actionPerformed button))))

(defn handle-mouse-input
  "mouse-x - `int`
  mouse-y - `int`

  throws: java.io.IOException"
  ([^GuiScrollingList this ^Integer mouse-x ^Integer mouse-y]
    (-> this (.handleMouseInput mouse-x mouse-y))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiScrollingList this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

