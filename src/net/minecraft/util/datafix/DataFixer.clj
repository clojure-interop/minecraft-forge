(ns net.minecraft.util.datafix.DataFixer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix DataFixer]))

(defn ->data-fixer
  "Constructor.

  version-in - `int`"
  (^DataFixer [^Integer version-in]
    (new DataFixer version-in)))

(defn version
  "Instance Constant.

  type: int"
  (^Integer [^DataFixer this]
    (-> this .-version)))

(defn process
  "type - `net.minecraft.util.datafix.IFixType`
  compound - `net.minecraft.nbt.NBTTagCompound`
  version-in - `int`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^DataFixer this ^net.minecraft.util.datafix.IFixType type ^net.minecraft.nbt.NBTTagCompound compound ^Integer version-in]
    (-> this (.process type compound version-in)))
  (^net.minecraft.nbt.NBTTagCompound [^DataFixer this ^net.minecraft.util.datafix.IFixType type ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.process type compound))))

(defn register-walker
  "type - `net.minecraft.util.datafix.FixTypes`
  walker - `net.minecraft.util.datafix.IDataWalker`"
  ([^DataFixer this ^net.minecraft.util.datafix.FixTypes type ^net.minecraft.util.datafix.IDataWalker walker]
    (-> this (.registerWalker type walker))))

(defn register-vanilla-walker
  "type - `net.minecraft.util.datafix.IFixType`
  walker - `net.minecraft.util.datafix.IDataWalker`"
  ([^DataFixer this ^net.minecraft.util.datafix.IFixType type ^net.minecraft.util.datafix.IDataWalker walker]
    (-> this (.registerVanillaWalker type walker))))

(defn register-fix
  "type - `net.minecraft.util.datafix.IFixType`
  fixable - `net.minecraft.util.datafix.IFixableData`"
  ([^DataFixer this ^net.minecraft.util.datafix.IFixType type ^net.minecraft.util.datafix.IFixableData fixable]
    (-> this (.registerFix type fixable))))

