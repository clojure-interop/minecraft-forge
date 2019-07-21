(ns net.minecraftforge.common.util.ModFixs
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.util ModFixs]))

(defn get-fixes
  "type - `net.minecraft.util.datafix.IFixType`

  returns: `java.util.List<net.minecraft.util.datafix.IFixableData>`"
  (^java.util.List [^ModFixs this ^net.minecraft.util.datafix.IFixType type]
    (-> this (.getFixes type))))

(defn register-fix
  "type - `net.minecraft.util.datafix.IFixType`
  fixer - `net.minecraft.util.datafix.IFixableData`"
  ([^ModFixs this ^net.minecraft.util.datafix.IFixType type ^net.minecraft.util.datafix.IFixableData fixer]
    (-> this (.registerFix type fixer))))

