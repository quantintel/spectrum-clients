#import <Foundation/Foundation.h>
#import "SWGHealth.h"



@interface SWGAdminApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGAdminApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Pings service
 
 */
-(NSNumber*) pingWithCompletionBlock :(void (^)(NSString* output, NSError* error))completionBlock;

/**

 Returns health report on this JVM
 
 */
-(NSNumber*) getHealthWithCompletionBlock :(void (^)(SWGHealth* output, NSError* error))completionBlock;

@end
