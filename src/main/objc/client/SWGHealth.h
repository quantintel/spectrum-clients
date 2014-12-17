#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGMemory.h"


@interface SWGHealth : SWGObject

@property(nonatomic) NSNumber* liveThreadCount;  

@property(nonatomic) NSNumber* peakThreadCount;  

@property(nonatomic) NSNumber* startedThreadCount;  

@property(nonatomic) NSNumber* daemonThreadCount;  

@property(nonatomic) SWGMemory* memory;  

- (id) liveThreadCount: (NSNumber*) liveThreadCount
     peakThreadCount: (NSNumber*) peakThreadCount
     startedThreadCount: (NSNumber*) startedThreadCount
     daemonThreadCount: (NSNumber*) daemonThreadCount
     memory: (SWGMemory*) memory;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

