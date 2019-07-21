(ns net.minecraftforge.fml.client.GuiSortingProblem
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client GuiSortingProblem]))

(defn ->gui-sorting-problem
  "Constructor.

  mod-sorting - `net.minecraftforge.fml.common.toposort.ModSortingException`"
  (^GuiSortingProblem [^net.minecraftforge.fml.common.toposort.ModSortingException mod-sorting]
    (new GuiSortingProblem mod-sorting)))

(defn init-gui
  ""
  ([^GuiSortingProblem this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiSortingProblem this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

