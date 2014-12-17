#import <Foundation/Foundation.h>



@interface SWGDateApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGDateApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 month for the date provided
 
 @param serialNumber date serial number
 */
-(NSNumber*) dtMonthWithCompletionBlock :(NSNumber*) serialNumber 
        completionHandler: (void (^)(NSString* output, NSError* error))completionBlock;

/**

 year of the serial number provided
 
 @param serialNumber date serial number
 */
-(NSNumber*) dtYearWithCompletionBlock :(NSNumber*) serialNumber 
        completionHandler: (void (^)(NSString* output, NSError* error))completionBlock;

/**

 returns whether the current year is a leap year.
 
 */
-(NSNumber*) isLeapYearWithCompletionBlock :(void (^)(NSString* output, NSError* error))completionBlock;

/**

 returns whether the date provided is within a leap year.
 
 */
-(NSNumber*) dtstrIsLeapYear WithCompletionBlock :(void (^)(NSString* output, NSError* error))completionBlock;

/**

 month for the current date
 
 */
-(NSNumber*) monthWithCompletionBlock :(void (^)(NSString* output, NSError* error))completionBlock;

/**

 today's date
 
 @param serialNumber date serial number
 */
-(NSNumber*) simpleFmtWithCompletionBlock :(NSNumber*) serialNumber 
        completionHandler: (void (^)(NSString* output, NSError* error))completionBlock;

/**

 month for the date provided
 
 */
-(NSNumber*) dtstrMonthWithCompletionBlock :(void (^)(NSString* output, NSError* error))completionBlock;

/**

 day of the month for the date provided
 
 */
-(NSNumber*) dtstrDayOfMonthWithCompletionBlock :(void (^)(NSString* output, NSError* error))completionBlock;

/**

 returns whether the date provided is within a leap year.
 
 @param serialNumber date serial number
 */
-(NSNumber*) dtIsLeapYearWithCompletionBlock :(NSNumber*) serialNumber 
        completionHandler: (void (^)(NSString* output, NSError* error))completionBlock;

/**

 day of the current year
 
 */
-(NSNumber*) dayOfYearWithCompletionBlock :(void (^)(NSString* output, NSError* error))completionBlock;

/**

 today's date in SimpleFormat
 returns the current date formatted in SimpleFormat
 */
-(NSNumber*) todaySimpleFmtWithCompletionBlock :(void (^)(NSString* output, NSError* error))completionBlock;

/**

 day of year for the date provided
 
 */
-(NSNumber*) dtstrDayOfYear WithCompletionBlock :(void (^)(NSString* output, NSError* error))completionBlock;

/**

 the current day of the week
 
 */
-(NSNumber*) weekdayWithCompletionBlock :(void (^)(NSString* output, NSError* error))completionBlock;

/**

 the day of the week for the corresponding dd, mm, yyyy indicated
 
 */
-(NSNumber*) dtstrWeekdayWithCompletionBlock :(void (^)(NSString* output, NSError* error))completionBlock;

/**

 date for the mm dd and yy indicated.
 
 */
-(NSNumber*) dtstrYearWithCompletionBlock :(void (^)(NSString* output, NSError* error))completionBlock;

/**

 day of the month for the current date.
 
 */
-(NSNumber*) dayOfMonthWithCompletionBlock :(void (^)(NSString* output, NSError* error))completionBlock;

/**

 year of the current date
 
 */
-(NSNumber*) yearWithCompletionBlock :(void (^)(NSString* output, NSError* error))completionBlock;

/**

 day of year for the date provided
 
 @param serialNumber date serial number
 */
-(NSNumber*) dtDayOfYear WithCompletionBlock :(NSNumber*) serialNumber 
        completionHandler: (void (^)(NSString* output, NSError* error))completionBlock;

/**

 day of the month for the date provided
 
 @param serialNumber date serial number
 */
-(NSNumber*) dtDayOfMonthWithCompletionBlock :(NSNumber*) serialNumber 
        completionHandler: (void (^)(NSString* output, NSError* error))completionBlock;

/**

 today's serial number
 returns serial number of current date
 */
-(NSNumber*) todayWithCompletionBlock :(void (^)(NSNumber* output, NSError* error))completionBlock;

/**

 the day of the week associated with the serial number provided
 
 @param serialNumber date serial number
 */
-(NSNumber*) dtWeekdayWithCompletionBlock :(NSNumber*) serialNumber 
        completionHandler: (void (^)(NSString* output, NSError* error))completionBlock;

@end
