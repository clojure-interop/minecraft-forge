(ns net.minecraftforge.fml.client.config.HoverChecker
  "This class implements an easy way to check if the mouse has hovered within a certain region of the screen for a given
  period of time. The region can be defined manually or by supplying a GuiButton object."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config HoverChecker]))

(defn ->hover-checker
  "Constructor.

  top - `int`
  bottom - `int`
  left - `int`
  right - `int`
  threshold - `int`"
  (^HoverChecker [^Integer top ^Integer bottom ^Integer left ^Integer right ^Integer threshold]
    (new HoverChecker top bottom left right threshold))
  (^HoverChecker [^net.minecraft.client.gui.GuiButton button ^Integer threshold]
    (new HoverChecker button threshold)))

(defn update-bounds
  "Call this method if the intended region has changed such as if the region must follow a scrolling list.
   It is not necessary to call this method if a GuiButton defines the hover region.

  top - `int`
  bottom - `int`
  left - `int`
  right - `int`"
  ([^HoverChecker this ^Integer top ^Integer bottom ^Integer left ^Integer right]
    (-> this (.updateBounds top bottom left right))))

(defn check-hover
  "Checks if the mouse is in the hover region. If the specified time period has elapsed the method returns true.
   The hover timer is reset if the mouse is not within the region.

  mouse-x - `int`
  mouse-y - `int`
  can-hover - `boolean`

  returns: `boolean`"
  (^Boolean [^HoverChecker this ^Integer mouse-x ^Integer mouse-y ^Boolean can-hover]
    (-> this (.checkHover mouse-x mouse-y can-hover)))
  (^Boolean [^HoverChecker this ^Integer mouse-x ^Integer mouse-y]
    (-> this (.checkHover mouse-x mouse-y))))

(defn reset-hover-timer
  "Manually resets the hover timer."
  ([^HoverChecker this]
    (-> this (.resetHoverTimer))))

