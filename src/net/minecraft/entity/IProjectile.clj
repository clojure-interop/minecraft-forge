(ns net.minecraft.entity.IProjectile
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity IProjectile]))

(defn set-throwable-heading
  "x - `double`
  y - `double`
  z - `double`
  velocity - `float`
  inaccuracy - `float`"
  ([^IProjectile this ^Double x ^Double y ^Double z ^Float velocity ^Float inaccuracy]
    (-> this (.setThrowableHeading x y z velocity inaccuracy))))

