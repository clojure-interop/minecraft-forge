(ns net.minecraftforge.common.ForgeVersion$CheckResult
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common ForgeVersion$CheckResult]))

(defn status
  "Instance Constant.

  type: net.minecraftforge.common.ForgeVersion$Status"
  (^net.minecraftforge.common.ForgeVersion$Status [^ForgeVersion$CheckResult this]
    (-> this .-status)))

(defn target
  "Instance Constant.

  type: net.minecraftforge.fml.common.versioning.ComparableVersion"
  (^net.minecraftforge.fml.common.versioning.ComparableVersion [^ForgeVersion$CheckResult this]
    (-> this .-target)))

(defn changes
  "Instance Constant.

  type: java.util.Map<net.minecraftforge.fml.common.versioning.ComparableVersion,java.lang.String>"
  (^java.util.Map [^ForgeVersion$CheckResult this]
    (-> this .-changes)))

(defn url
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^ForgeVersion$CheckResult this]
    (-> this .-url)))

