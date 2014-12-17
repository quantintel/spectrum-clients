#import "SWGDate.h"
#import "SWGMemory.h"

@implementation SWGMemory

-(id)allocated: (NSNumber*) allocated
    max: (NSNumber*) max
    free: (NSNumber*) free
    used: (NSNumber*) used
    percentUsed: (NSNumber*) percentUsed
{
  _allocated = allocated;
  _max = max;
  _free = free;
  _used = used;
  _percentUsed = percentUsed;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _allocated = dict[@"allocated"]; 
        _max = dict[@"max"]; 
        _free = dict[@"free"]; 
        _used = dict[@"used"]; 
        _percentUsed = dict[@"percentUsed"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_allocated != nil) dict[@"allocated"] = _allocated ;
        if(_max != nil) dict[@"max"] = _max ;
        if(_free != nil) dict[@"free"] = _free ;
        if(_used != nil) dict[@"used"] = _used ;
        if(_percentUsed != nil) dict[@"percentUsed"] = _percentUsed ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

